package com.alurachallege;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConvertidor {


    public Convertidor Convertidor(String base_code, String target_code, Double cantidad) {
        String codigoApi = "c9dffd8f94d69342326ac193";
        URI link = URI.create("https://v6.exchangerate-api.com/v6/c9dffd8f94d69342326ac193/pair/" + base_code + "/" + target_code + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(link)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Convertidor.class);
        } catch (Exception e) {


        }

        return null;
    }
}
