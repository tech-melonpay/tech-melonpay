package w3;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MapBackedMetadataContainer.java */
/* loaded from: classes.dex */
public final class d<T> implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30819a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final a<T> f30820b;

    /* compiled from: MapBackedMetadataContainer.java */
    public interface a<T> {
        T a(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata);
    }

    public d(a<T> aVar) {
        this.f30820b = aVar;
    }

    @Override // w3.e
    public final void a(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        this.f30819a.put(this.f30820b.a(phonemetadata$PhoneMetadata), phonemetadata$PhoneMetadata);
    }
}
