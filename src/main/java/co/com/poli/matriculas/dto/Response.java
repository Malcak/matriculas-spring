package co.com.poli.matriculas.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "init")
public class Response {
    private Integer status;
    private Object data;
}
