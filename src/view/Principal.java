package view;

import java.io.IOException;

import Controller.ArquivosController;
import Controller.IarquivosController;

public class Principal {
public static void main(String[] args) {
	IarquivosController arqCont= new ArquivosController();
	String dirWin="C:\\TEMP\\generic_food.csv";
	try {
		arqCont.read(dirWin);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}

