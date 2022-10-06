package com.luizmangerotte.eventproject.model.enums;

import java.util.Arrays;

public enum Category {

    PATY(1),
    SPORTS(2),
    SHOWS(3),
    CORPORATE(4),
    RELIGIOUS(5);

    private int code;

    private Category (int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }

    public static Category valueOf(int code) {
        return Arrays.stream(Category.values())
                .filter(value-> value.getCode() == code)
                .findAny().get();
    }


}
