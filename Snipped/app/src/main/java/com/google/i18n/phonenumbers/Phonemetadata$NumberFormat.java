package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Phonemetadata$NumberFormat implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10448d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10451g;

    /* renamed from: a, reason: collision with root package name */
    public String f10445a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f10446b = "";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10447c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public String f10449e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f10450f = false;

    /* renamed from: h, reason: collision with root package name */
    public String f10452h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.f10445a = objectInput.readUTF();
        this.f10446b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f10447c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f10448d = true;
            this.f10449e = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f10451g = true;
            this.f10452h = readUTF2;
        }
        this.f10450f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f10445a);
        objectOutput.writeUTF(this.f10446b);
        int size = this.f10447c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) this.f10447c.get(i));
        }
        objectOutput.writeBoolean(this.f10448d);
        if (this.f10448d) {
            objectOutput.writeUTF(this.f10449e);
        }
        objectOutput.writeBoolean(this.f10451g);
        if (this.f10451g) {
            objectOutput.writeUTF(this.f10452h);
        }
        objectOutput.writeBoolean(this.f10450f);
    }
}
