package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Phonemetadata$PhoneMetadata implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: A, reason: collision with root package name */
    public boolean f10453A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10455C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10457E;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10459G;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10464L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f10466N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f10468P;
    public boolean R;
    public boolean T;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f10470Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10471a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10475c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10477e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10479g;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10482k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10484m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10486o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10488q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10490s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10492u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10494w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10496y;

    /* renamed from: b, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10473b = null;

    /* renamed from: d, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10476d = null;

    /* renamed from: f, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10478f = null;

    /* renamed from: h, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10480h = null;

    /* renamed from: j, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10481j = null;

    /* renamed from: l, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10483l = null;

    /* renamed from: n, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10485n = null;

    /* renamed from: p, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10487p = null;

    /* renamed from: r, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10489r = null;

    /* renamed from: t, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10491t = null;

    /* renamed from: v, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10493v = null;

    /* renamed from: x, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10495x = null;

    /* renamed from: z, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10497z = null;

    /* renamed from: B, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10454B = null;

    /* renamed from: D, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10456D = null;

    /* renamed from: F, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10458F = null;

    /* renamed from: H, reason: collision with root package name */
    public Phonemetadata$PhoneNumberDesc f10460H = null;

    /* renamed from: I, reason: collision with root package name */
    public String f10461I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f10462J = 0;

    /* renamed from: K, reason: collision with root package name */
    public String f10463K = "";

    /* renamed from: M, reason: collision with root package name */
    public String f10465M = "";

    /* renamed from: O, reason: collision with root package name */
    public String f10467O = "";

    /* renamed from: Q, reason: collision with root package name */
    public String f10469Q = "";
    public String S = "";
    public String U = "";
    public boolean V = false;
    public final ArrayList W = new ArrayList();
    public final ArrayList X = new ArrayList();
    public boolean Y = false;

    /* renamed from: a0, reason: collision with root package name */
    public String f10472a0 = "";

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10474b0 = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.f10471a = true;
            this.f10473b = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.f10475c = true;
            this.f10476d = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.f10477e = true;
            this.f10478f = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.f10479g = true;
            this.f10480h = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.i = true;
            this.f10481j = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.f10482k = true;
            this.f10483l = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.f10484m = true;
            this.f10485n = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.f10486o = true;
            this.f10487p = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.f10488q = true;
            this.f10489r = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.f10490s = true;
            this.f10491t = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.f10492u = true;
            this.f10493v = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.f10494w = true;
            this.f10495x = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.f10496y = true;
            this.f10497z = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.f10453A = true;
            this.f10454B = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.f10455C = true;
            this.f10456D = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.f10457E = true;
            this.f10458F = phonemetadata$PhoneNumberDesc16;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc17 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc17.readExternal(objectInput);
            this.f10459G = true;
            this.f10460H = phonemetadata$PhoneNumberDesc17;
        }
        this.f10461I = objectInput.readUTF();
        this.f10462J = objectInput.readInt();
        this.f10463K = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f10464L = true;
            this.f10465M = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f10466N = true;
            this.f10467O = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f10468P = true;
            this.f10469Q = readUTF3;
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
            this.f10470Z = true;
            this.f10472a0 = readUTF6;
        }
        this.f10474b0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f10471a);
        if (this.f10471a) {
            this.f10473b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10475c);
        if (this.f10475c) {
            this.f10476d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10477e);
        if (this.f10477e) {
            this.f10478f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10479g);
        if (this.f10479g) {
            this.f10480h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.f10481j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10482k);
        if (this.f10482k) {
            this.f10483l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10484m);
        if (this.f10484m) {
            this.f10485n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10486o);
        if (this.f10486o) {
            this.f10487p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10488q);
        if (this.f10488q) {
            this.f10489r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10490s);
        if (this.f10490s) {
            this.f10491t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10492u);
        if (this.f10492u) {
            this.f10493v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10494w);
        if (this.f10494w) {
            this.f10495x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10496y);
        if (this.f10496y) {
            this.f10497z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10453A);
        if (this.f10453A) {
            this.f10454B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10455C);
        if (this.f10455C) {
            this.f10456D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10457E);
        if (this.f10457E) {
            this.f10458F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f10459G);
        if (this.f10459G) {
            this.f10460H.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f10461I);
        objectOutput.writeInt(this.f10462J);
        objectOutput.writeUTF(this.f10463K);
        objectOutput.writeBoolean(this.f10464L);
        if (this.f10464L) {
            objectOutput.writeUTF(this.f10465M);
        }
        objectOutput.writeBoolean(this.f10466N);
        if (this.f10466N) {
            objectOutput.writeUTF(this.f10467O);
        }
        objectOutput.writeBoolean(this.f10468P);
        if (this.f10468P) {
            objectOutput.writeUTF(this.f10469Q);
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
        ArrayList arrayList2 = this.X;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            ((Phonemetadata$NumberFormat) arrayList2.get(i9)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.f10470Z);
        if (this.f10470Z) {
            objectOutput.writeUTF(this.f10472a0);
        }
        objectOutput.writeBoolean(this.f10474b0);
    }
}
