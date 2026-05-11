package controllers;

import models.Person;

public class PersonController {

    public void sortPersonByAge(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i-1;
            while (j >= 0 && personas[j].getEdad() > aux.getEdad()){
                personas[j+1] = personas[j];
                j--;

            }
            personas[j+1] = aux;
            
        }
    }

    public void sortPersonByName(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getNombre().compareTo(aux.getNombre()) > 0){
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    public void sortPersonByNotas(Person[] personas){
        for (int i = 0; i < personas.length; i++){
            int indiceMenor = i;

            for(int j = i+1; j < personas.length; j++){
                if(personas[j].getValorName()< personas[indiceMenor].getValorName()){
                    indiceMenor = j;
                    
                }
            }
            if(i != indiceMenor){
                Person aux = personas[i];
                personas[i] = personas[indiceMenor];
                personas[indiceMenor] = aux;
            }

        }
    }
    public void sortPersonByNameValue(Person[] personas){

    }

    
}


