package curso.cochera.apis;

import org.springframework.http.HttpMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;
import java.util.StringJoiner;

@Component
@Slf4j
public class Api {



    public WebClient.ResponseSpec call(WebClient webClient, HttpMethod method, String path, Map<String, String> parametros) {

        String uri;
        if (!parametros.isEmpty())
            uri = path + "?" + getJoinerParameters(parametros).toString();
        else
            uri = path;

        return webClient
                .method(method)
                .uri(uri)
                .retrieve();
    }



    public StringJoiner getJoinerParameters(Map<String, String> parametros){

        StringJoiner joiner = new StringJoiner("&");
        for (Map.Entry<String, String> entry : parametros.entrySet()) {
            try {
                String parametro = entry.getKey();
                String valor = entry.getValue();
                String parClaveValor = parametro + "=" + valor;
                joiner.add(parClaveValor);
            }catch (Exception e){
                log.error("getJoinerParameters " + e.getMessage());
            }
        }
        return joiner;
    }

}
