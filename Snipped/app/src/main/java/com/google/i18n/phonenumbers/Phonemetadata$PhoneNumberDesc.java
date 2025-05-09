package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Phonemetadata$PhoneNumberDesc implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10499a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10503e;

    /* renamed from: b, reason: collision with root package name */
    public String f10500b = "";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10501c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10502d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f10504f = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f10499a = true;
            this.f10500b = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f10501c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i9 = 0; i9 < readInt2; i9++) {
            this.f10502d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f10503e = true;
            this.f10504f = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f10499a);
        if (this.f10499a) {
            objectOutput.writeUTF(this.f10500b);
        }
        ArrayList arrayList = this.f10501c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) arrayList.get(i)).intValue());
        }
        ArrayList arrayList2 = this.f10502d;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i9)).intValue());
        }
        objectOutput.writeBoolean(this.f10503e);
        if (this.f10503e) {
            objectOutput.writeUTF(this.f10504f);
        }
    }
}
