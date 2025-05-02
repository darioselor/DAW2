package com.example.presentationLayer.common.error;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({ ResourceNotFoundException.class })
    @ResponeBody
    public ErrorMessage notFoundRequest(ResourceNOtFoundException exception) {
        return new ErrorMessage(exception);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorMessage handleGeneralException(Exception exception) {
        return new ErrorMessage(exception);
    }
}
