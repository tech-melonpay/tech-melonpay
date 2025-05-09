package io.michaelrocks.libphonenumber.android;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Phonemetadata$PhoneMetadata implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public boolean f21597A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21599C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21601E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21603G;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21608L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f21610N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f21612P;
    public boolean R;
    public boolean T;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f21614Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21615a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21619c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21622e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21624g;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21627k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21629m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21631o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21633q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21635s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21637u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21639w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21641y;

    /* renamed from: b, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21617b = null;

    /* renamed from: d, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21621d = null;

    /* renamed from: f, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21623f = null;

    /* renamed from: h, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21625h = null;

    /* renamed from: j, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21626j = null;

    /* renamed from: l, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21628l = null;

    /* renamed from: n, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21630n = null;

    /* renamed from: p, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21632p = null;

    /* renamed from: r, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21634r = null;

    /* renamed from: t, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21636t = null;

    /* renamed from: v, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21638v = null;

    /* renamed from: x, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21640x = null;

    /* renamed from: z, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21642z = null;

    /* renamed from: B, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21598B = null;

    /* renamed from: D, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21600D = null;

    /* renamed from: F, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21602F = null;

    /* renamed from: H, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f21604H = null;

    /* renamed from: I, reason: collision with root package name */
    public String f21605I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f21606J = 0;

    /* renamed from: K, reason: collision with root package name */
    public String f21607K = "";

    /* renamed from: M, reason: collision with root package name */
    public String f21609M = "";

    /* renamed from: O, reason: collision with root package name */
    public String f21611O = "";

    /* renamed from: Q, reason: collision with root package name */
    public String f21613Q = "";
    public String S = "";
    public String U = "";
    public boolean V = false;
    public final ArrayList W = new ArrayList();
    public final ArrayList X = new ArrayList();
    public boolean Y = false;

    /* renamed from: a0, reason: collision with root package name */
    public String f21616a0 = "";

    /* renamed from: b0, reason: collision with root package name */
    public boolean f21618b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f21620c0 = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.f21615a = true;
            this.f21617b = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.f21619c = true;
            this.f21621d = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.f21622e = true;
            this.f21623f = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.f21624g = true;
            this.f21625h = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.i = true;
            this.f21626j = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.f21627k = true;
            this.f21628l = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.f21629m = true;
            this.f21630n = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.f21631o = true;
            this.f21632p = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.f21633q = true;
            this.f21634r = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.f21635s = true;
            this.f21636t = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.f21637u = true;
            this.f21638v = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.f21639w = true;
            this.f21640x = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.f21641y = true;
            this.f21642z = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.f21597A = true;
            this.f21598B = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.f21599C = true;
            this.f21600D = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.f21601E = true;
            this.f21602F = phonemetadata$PhoneNumberDesc16;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc17 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc17.readExternal(objectInput);
            this.f21603G = true;
            this.f21604H = phonemetadata$PhoneNumberDesc17;
        }
        this.f21605I = objectInput.readUTF();
        this.f21606J = objectInput.readInt();
        this.f21607K = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f21608L = true;
            this.f21609M = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f21610N = true;
            this.f21611O = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f21612P = true;
            this.f21613Q = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.R = true;
            this.S = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.T = true;
            this.U = readUTF5;
        }
        this.V = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.W.add(phonemetadata$NumberFormat);
        }
        int readInt2 = objectInput.readInt();
        for (int i9 = 0; i9 < readInt2; i9++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.X.add(phonemetadata$NumberFormat2);
        }
        this.Y = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.f21614Z = true;
            this.f21616a0 = readUTF6;
        }
        this.f21618b0 = objectInput.readBoolean();
        this.f21620c0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f21615a);
        if (this.f21615a) {
            this.f21617b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21619c);
        if (this.f21619c) {
            this.f21621d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21622e);
        if (this.f21622e) {
            this.f21623f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21624g);
        if (this.f21624g) {
            this.f21625h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.f21626j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21627k);
        if (this.f21627k) {
            this.f21628l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21629m);
        if (this.f21629m) {
            this.f21630n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21631o);
        if (this.f21631o) {
            this.f21632p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21633q);
        if (this.f21633q) {
            this.f21634r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21635s);
        if (this.f21635s) {
            this.f21636t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21637u);
        if (this.f21637u) {
            this.f21638v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21639w);
        if (this.f21639w) {
            this.f21640x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21641y);
        if (this.f21641y) {
            this.f21642z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21597A);
        if (this.f21597A) {
            this.f21598B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21599C);
        if (this.f21599C) {
            this.f21600D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21601E);
        if (this.f21601E) {
            this.f21602F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f21603G);
        if (this.f21603G) {
            this.f21604H.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f21605I);
        objectOutput.writeInt(this.f21606J);
        objectOutput.writeUTF(this.f21607K);
        objectOutput.writeBoolean(this.f21608L);
        if (this.f21608L) {
            objectOutput.writeUTF(this.f21609M);
        }
        objectOutput.writeBoolean(this.f21610N);
        if (this.f21610N) {
            objectOutput.writeUTF(this.f21611O);
        }
        objectOutput.writeBoolean(this.f21612P);
        if (this.f21612P) {
            objectOutput.writeUTF(this.f21613Q);
        }
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            objectOutput.writeUTF(this.S);
        }
        objectOutput.writeBoolean(this.T);
        if (this.T) {
            objectOutput.writeUTF(this.U);
        }
        objectOutput.writeBoolean(this.V);
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((Phonemetadata$NumberFormat) arrayList.get(i)).writeExternal(objectOutput);
        }
        int size2 = this.X.size();
        objectOutput.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            ((Phonemetadata$NumberFormat) this.X.get(i9)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.f21614Z);
        if (this.f21614Z) {
            objectOutput.writeUTF(this.f21616a0);
        }
        objectOutput.writeBoolean(this.f21618b0);
        objectOutput.writeBoolean(this.f21620c0);
    }
}
