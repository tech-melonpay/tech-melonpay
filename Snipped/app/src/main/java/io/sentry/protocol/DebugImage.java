package io.sentry.protocol;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DebugImage implements F {
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public static final class a implements A<DebugImage> {
        @Override // io.sentry.A
        public final DebugImage a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            DebugImage debugImage = new DebugImage();
            d10.i();
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "debug_file":
                        debugImage.debugFile = d10.s0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = d10.s0();
                        break;
                    case "image_size":
                        debugImage.imageSize = d10.a0();
                        break;
                    case "code_file":
                        debugImage.codeFile = d10.s0();
                        break;
                    case "arch":
                        debugImage.arch = d10.s0();
                        break;
                    case "type":
                        debugImage.type = d10.s0();
                        break;
                    case "uuid":
                        debugImage.uuid = d10.s0();
                        break;
                    case "debug_id":
                        debugImage.debugId = d10.s0();
                        break;
                    case "code_id":
                        debugImage.codeId = d10.s0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        d10.t0(interfaceC0859q, hashMap, g02);
                        break;
                }
            }
            d10.A();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.F
    public void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.uuid != null) {
            e10.P("uuid");
            e10.H(this.uuid);
        }
        if (this.type != null) {
            e10.P("type");
            e10.H(this.type);
        }
        if (this.debugId != null) {
            e10.P("debug_id");
            e10.H(this.debugId);
        }
        if (this.debugFile != null) {
            e10.P("debug_file");
            e10.H(this.debugFile);
        }
        if (this.codeId != null) {
            e10.P("code_id");
            e10.H(this.codeId);
        }
        if (this.codeFile != null) {
            e10.P("code_file");
            e10.H(this.codeFile);
        }
        if (this.imageAddr != null) {
            e10.P("image_addr");
            e10.H(this.imageAddr);
        }
        if (this.imageSize != null) {
            e10.P("image_size");
            e10.G(this.imageSize);
        }
        if (this.arch != null) {
            e10.P("arch");
            e10.H(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.unknown, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l10) {
        this.imageSize = l10;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j10) {
        this.imageSize = Long.valueOf(j10);
    }
}
