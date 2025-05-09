package io.michaelrocks.libphonenumber.android;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Phonemetadata$NumberFormat implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21592d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21595g;

    /* renamed from: a, reason: collision with root package name */
    public String f21589a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f21590b = "";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21591c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public String f21593e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f21594f = false;

    /* renamed from: h, reason: collision with root package name */
    public String f21596h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f21589a = objectInput.readUTF();
        this.f21590b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f21591c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f21592d = true;
            this.f21593e = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f21595g = true;
            this.f21596h = readUTF2;
        }
        this.f21594f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f21589a);
        objectOutput.writeUTF(this.f21590b);
        int size = this.f21591c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.f21591c.get(i));
        }
        objectOutput.writeBoolean(this.f21592d);
        if (this.f21592d) {
            objectOutput.writeUTF(this.f21593e);
        }
        objectOutput.writeBoolean(this.f21595g);
        if (this.f21595g) {
            objectOutput.writeUTF(this.f21596h);
        }
        objectOutput.writeBoolean(this.f21594f);
    }
}
