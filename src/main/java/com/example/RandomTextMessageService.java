package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("RandomMessageService")
public class RandomTextMessageService implements MessageService {

    List<String> messages = new ArrayList<>(Arrays.asList(
            "wiadomosc0", "wiadomosc1", "wiadomosc2", "wiadomosc3", "wiadomosc4", "wiadomosc5", "wiadomosc6",
            "wiadomosc7", "wiadomosc8", "wiadomosc9"
    ));

    @Override
    public String getMessage() {
        Random random = new Random();
        int randomInt = random. nextInt(10);
        return messages.get(randomInt);
    }
}
