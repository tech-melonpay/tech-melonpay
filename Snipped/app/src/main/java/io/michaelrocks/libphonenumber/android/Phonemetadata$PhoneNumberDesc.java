package io.michaelrocks.libphonenumber.android;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Phonemetadata$PhoneNumberDesc implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21644a;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21648e;

    /* renamed from: b, reason: collision with root package name */
    public String f21645b = "";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21646c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f21647d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f21649f = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f21644a = true;
            this.f21645b = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f21646c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i9 = 0; i9 < readInt2; i9++) {
            this.f21647d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f21648e = true;
            this.f21649f = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f21644a);
        if (this.f21644a) {
            objectOutput.writeUTF(this.f21645b);
        }
        int size = this.f21646c.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) this.f21646c.get(i)).intValue());
        }
        ArrayList arrayList = this.f21647d;
        int size2 = arrayList.size();
        objectOutput.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            objectOutput.writeInt(((Integer) arrayList.get(i9)).intValue());
        }
        objectOutput.writeBoolean(this.f21648e);
        if (this.f21648e) {
            objectOutput.writeUTF(this.f21649f);
        }
    }
}
