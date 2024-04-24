import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import models.BerryFlavor;
import models.ContestType;
import models.Language;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador {

    public static List<String> getAllJson() {
        List<String> all = new ArrayList<>();
        String json;
        HttpClient client = getClient();

        for (int i = 1; i <= 5; i++) {
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create("https://pokeapi.co/api/v2/contest-type/" + i))
                    .build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    json = response.body();
                    all.add(json);
                } else {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, "Servidor responde: " + response.statusCode());
                }
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }
        return all;
    }

    public static List<ContestType> getAll(List<String> jsons){
        List<ContestType> all = new ArrayList<>();
        for(String item : jsons){
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                ContestType contestType = objectMapper.readValue(item, ContestType.class);
                ContestType type = new ContestType(
                        contestType.getId(),
                        contestType.getName(),
                        new BerryFlavor(contestType.getBerry_flavor().getName(),contestType.getBerry_flavor().getUrl()),
                        contestType.getNames()
                );
               all.add(type);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return all;
    }


    private static HttpClient getClient() {
        HttpClient client = HttpClient
                .newBuilder()
                .build();
        return client;
    }

}
