package kotlinx.serialization;

import kotlin.Metadata;

/* compiled from: SerializationExceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(com.google.android.gms.measurement.internal.a.g(i, "An unknown field for index "));
    }
}
