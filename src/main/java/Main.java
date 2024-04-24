import com.fasterxml.jackson.databind.ObjectMapper;
import models.ContestName;
import models.ContestType;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<ContestType> todos = Controlador.getAll(Controlador.getAllJson());
        for(ContestType ct : todos){
            System.out.println(ct);
        }

    }

}
