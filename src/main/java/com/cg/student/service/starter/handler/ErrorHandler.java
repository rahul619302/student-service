package com.cg.student.service.starter.handler;

import com.cg.student.service.starter.constant.StudentConstants;
import com.cg.student.service.starter.payload.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandler {

    Logger logger= LogManager.getLogger(ErrorHandler.class);
    @ExceptionHandler(Exception.class)
    public Response handleNotFoundException(Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        Response response = new Response(StudentConstants.S400, StudentConstants.S400.getMessage());
        Map<String, Object> map = new LinkedHashMap<>(2);
        map.put("stackTrace", sw.toString());
        response.setMap(map);
        logger.info(sw.toString());
        return response;
    }
}
