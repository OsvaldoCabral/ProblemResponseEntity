package handleproblem.handleproblem;

import lombok.Data;

import java.util.Date;

@Data
public class CustomErrorMessage {

    String message;

    Date timestamp;

    public CustomErrorMessage(String message, Date timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
