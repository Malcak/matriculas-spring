package co.com.poli.matriculas.utilities;

import co.com.poli.matriculas.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ResponseBuilder {

    public Response success(){
        return Response.init()
                .status(HttpStatus.OK.value())
                .data(HttpStatus.OK.value())
                .build();
    }

    public Response success(Object data){
        return Response.init()
                .status(HttpStatus.OK.value())
                .data(data)
                .build();
    }

}
