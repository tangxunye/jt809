package jtframework.codec.checkSum.in;

import io.netty.buffer.ByteBuf;

public interface InCheck {
    /**
     * 校验
     */
    boolean check(ByteBuf buf);
}
