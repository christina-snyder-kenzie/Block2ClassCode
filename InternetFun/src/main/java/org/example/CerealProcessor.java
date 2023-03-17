package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class CerealProcessor {
    public static void main(String[] args) {
        //1. Get the JSON
        //2. Make the Object Mapper
        //3. Use the mapper's readValue method to conver to DTOs
        //4. Play with the DTO!

        File jsonFile = new File("cereal.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            CerealDTO dto = mapper.readValue(jsonFile, CerealDTO.class);
            System.out.println("Name: " + dto.getName());
            System.out.println(dto.getMarshmallows());

            CerealDTO_Generated dtoGen = mapper.readValue(jsonFile, CerealDTO_Generated.class);
            System.out.println(dtoGen.getMarshmallows());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
