package org.bouncycastle.mime;

import androidx.camera.core.impl.utils.a;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class MimeWriter {
    protected final Headers headers;

    public MimeWriter(Headers headers) {
        this.headers = headers;
    }

    public static List<String> mapToLines(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            StringBuilder r8 = a.r(str, ": ");
            r8.append(map.get(str));
            arrayList.add(r8.toString());
        }
        return arrayList;
    }

    public abstract OutputStream getContentStream();

    public Headers getHeaders() {
        return this.headers;
    }
}
