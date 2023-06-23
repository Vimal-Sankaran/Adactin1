package com.Adactin.helpers;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EntityHelper {

    public static List<CustomerData> readJsonFile() {
        String jsonPath = "C:\\Users\\JANANI\\IdeaProjects\\ProjectAdactin\\Adactin1\\Adactin\\src\\test\\resources\\CustomerData.json";
        ObjectMapper objectMapper = new ObjectMapper();
        List<CustomerData> customerDataList= null;

        try {
            customerDataList = objectMapper.readValue(new File(jsonPath), new TypeReference<List<CustomerData>>() {
            });
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return customerDataList;
    }

    private final List<CustomerData> customerDataList = readJsonFile();
    public CustomerData getCustomerDataById(String id) {
        CustomerData data = customerDataList.stream().filter(c->c.getId().equals(id)).findAny().orElse(null);
        return data;
    }

}
