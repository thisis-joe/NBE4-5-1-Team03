package com.shop.coffee.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    EXAMPLE("예시 메시지입니다."),
    NOSINGLEORDER("해당 주문이 존재하지 않습니다."),

    UNDEFINED("알 수 없는 오류가 발생했습니다."),
    ITEM_NOT_FOUND("해당 상품이 존재하지 않습니다."),
    NO_ORDER_NUMBER("해당 주문번호는 존재하지 않습니다."),
    NO_EMAIL("해당 이메일의 주문은 존재하지 않습니다."),
    ORDER_NOT_FOUND("해당 주문이 존재하지 않습니다.");

    private final String message;

}