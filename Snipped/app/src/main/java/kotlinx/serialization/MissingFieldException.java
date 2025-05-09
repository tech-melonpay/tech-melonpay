package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;

/* compiled from: SerializationExceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f23266a;

    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        this.f23266a = list;
    }
}
