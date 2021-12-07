package br.edu.univas.prova;

import java.util.Scanner;
import vo.CarData;
import vo.EngineData;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		EngineData[] engineData = new EngineData[50];
		CarData[] carData = new CarData[50];
		int option = 0;
		int currentPosition = 0;
		
		do {
			printMenu();
			option = readIntValue(scanner);
			
			if(option == 1) {
				newRegistration(scanner, engineData, carData, currentPosition);
				currentPosition++;
			}else if(option == 2) {
				printRecords(carData, engineData, currentPosition);
			}else if(option == 3) {
				removeRegister(engineData, carData, scanner);
			}else if(option != 4) {
				System.out.println("OPÇÃO INVÁLIDA!!! POR FAVOR DIGITE UMA OPÇÃO VÁLIDA!!!");
			}else {
				System.out.println("OBRIGADO POR UTILIZAR O SISTEMA!!!, ATÉ A PRÓXIMA!!!");
			}
		}while(option != 4);
	}
	
	public static void newRegistration(Scanner scanner, EngineData engineData[], CarData carData[], int currentPosition){
	
		EngineData valueEngine = new EngineData();
		CarData valueCar = new CarData();
		
		System.out.println("REALIZAÇÃO DE NOVO CADASTRO: ");
		
		System.out.println("POR FAVOR DIGITE A MARCA DO CARRO: ");
		valueCar.carBrand = scanner.nextLine();
		
		System.out.println("POR FAVOR DIGITE A COR DO CARRO: ");
		valueCar.color = scanner.nextLine();
		
		System.out.println("POR FAVOR DIGITE O ANO DE FABRICAÇÃO DO CARRO: ");
		valueCar.yearOfManufacture = readIntValue(scanner);
		
		System.out.println("POR FAVOR DIGITE A POTENCIA DO CARRO: ");
		valueEngine.potency = scanner.nextFloat();
		
		System.out.println("POR FAVOR DIGITE A QUANTIDADE DE CILINDROS DO CARRO: ");
		valueEngine.cylinders = readIntValue(scanner);
		
		for(int i = 0; i < currentPosition; i++) {
			if(engineData[i] == null && carData[i] == null) {
				engineData[i] = valueEngine;
				carData[i] = valueCar;
			}else {
				engineData[currentPosition] = valueEngine;
				carData[currentPosition] = valueCar;
			}
		}
		System.out.println("CADASTRO REALIZADO COM SUCESSO!!!");
	}
	
	public static void printRecords(CarData carData[], EngineData engineData[], int currentPosition) {
		System.out.println("CARROS CADASTRADOS: ");
		
		for(int i = 0; i < currentPosition; i++) {
			System.out.println("CARRO N°" + (i + 1) + ": ");
			
			CarData carDatas = carData[i];
			EngineData engineDatas = engineData[i];
			
			System.out.println("DADOS DO CARRO: ");	
			System.out.println("MARCA: " + carDatas.carBrand);
			System.out.println("COR: " + carDatas.color);
			System.out.println("ANO DE FABRICAÇÃO: " + carDatas.yearOfManufacture);
			System.out.println("DADOS DO MOTOR: ");
			System.out.println("POTENCIA: " + engineDatas.potency);
			System.out.println("CILINDROS: " + engineDatas.cylinders + "\n");
		}
		
	}
	
	public static void removeRegister(EngineData engineData[], CarData carData[], Scanner scanner) {
		System.out.println("DIGITE O CADASTRO QUE DESEJA REMOVER: ");
		int position = readIntValue(scanner);
		carData[position] = null;
		engineData[position] = null;
		System.out.println("CADASTRO REMOVIDO COM SUCESSO!!!");
	}
	
	public static void printMenu() {
		System.out.println("1. CADASTRO DE VEÍCULOS \n2. LISTAR TODOS OS VEÍCULOS \n3. REMOVER VEÍCULOS CADASTRADOS \n4. SAIR");
	}
	
	public static int readIntValue(Scanner scanner) {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}	
}
