package com.sumsub.sns.internal.core.data.serializer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import na.InterfaceC1078b;
import pa.e;
import pa.f;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* loaded from: classes2.dex */
public final class a implements InterfaceC1078b<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15821a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final f f15822b = kotlinx.serialization.descriptors.a.a("DateSerializer", e.i.f25738a);

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f15823c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

    @Override // na.InterfaceC1081e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC1145e interfaceC1145e, Date date) {
        interfaceC1145e.F(f15823c.format(date));
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public f getDescriptor() {
        return f15822b;
    }

    @Override // na.InterfaceC1077a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date deserialize(InterfaceC1144d interfaceC1144d) {
        try {
            Date parse = f15823c.parse(interfaceC1144d.p());
            return parse == null ? new Date() : parse;
        } catch (Throwable unused) {
            return new Date();
        }
    }
}
