package db;

import C.N;
import Fa.h;
import P9.s;
import java.util.ArrayList;
import java.util.Objects;
import ka.C0969n;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

/* compiled from: InstanceFactory.kt */
/* loaded from: classes3.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final BeanDefinition<T> f20487a;

    public b(BeanDefinition<T> beanDefinition) {
        this.f20487a = beanDefinition;
    }

    public T a(h hVar) {
        h hVar2 = (h) hVar.f1299b;
        boolean j10 = ((N) hVar2.f1301d).j(Level.f25554a);
        N n10 = (N) hVar2.f1301d;
        BeanDefinition<T> beanDefinition = this.f20487a;
        if (j10) {
            n10.f("| create instance for " + beanDefinition);
        }
        try {
            gb.a aVar = (gb.a) hVar.f1301d;
            if (aVar == null) {
                aVar = new gb.a(0);
            }
            return beanDefinition.f25544d.invoke((org.koin.core.scope.a) hVar.f1300c, aVar);
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e10);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e10.getStackTrace();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!(!C0969n.Y(stackTraceElement.getClassName(), "sun.reflect", false))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(s.P(arrayList, "\n\t", null, null, null, 62));
            Objects.toString(beanDefinition);
            ((Level) n10.f535b).compareTo(Level.f25556c);
            throw new InstanceCreationException("Could not create instance for " + beanDefinition, e10);
        }
    }

    public abstract T b(h hVar);
}
