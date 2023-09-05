package com.across.inventory.handler.exception;

public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException (String exception) { super(exception);}

    public RecordNotFoundException () { super();}

}
