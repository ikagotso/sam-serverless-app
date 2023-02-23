package lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Random;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<APIGatewayProxyRequestEvent, String> {
    Random random = new Random();
    public String handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        try {

            return "Coordinates of object in space are: " + random.nextDouble()
                + " -- " + random.nextDouble() + " -- " + random.nextDouble();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
