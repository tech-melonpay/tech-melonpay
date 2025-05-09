package A3;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ComponentFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p f80a = new p();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return new j((Context) componentContainer.get(Context.class));
    }
}
