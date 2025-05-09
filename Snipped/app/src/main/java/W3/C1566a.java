package w3;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;

/* compiled from: CompositeMetadataContainer.java */
/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d<Integer> f30817a = new d<>(new C1568c());

    /* renamed from: b, reason: collision with root package name */
    public final d<String> f30818b = new d<>(new C1567b());

    @Override // w3.e
    public final void a(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        d<String> dVar = this.f30818b;
        if (!dVar.f30820b.a(phonemetadata$PhoneMetadata).equals("001")) {
            dVar.a(phonemetadata$PhoneMetadata);
        } else {
            this.f30817a.a(phonemetadata$PhoneMetadata);
        }
    }
}
