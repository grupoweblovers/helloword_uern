package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    		String nome = "Fulano da Silva";
    		render(nome);
    }
    
    public static void ola(String nome) {
    		render(nome);
    }
    
    public static void somar(int num1, int num2) {
    		int soma = num1 + num2; 
    		renderText(soma);
    }
}