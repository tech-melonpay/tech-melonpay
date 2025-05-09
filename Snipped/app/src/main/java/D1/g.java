package d1;

/* compiled from: SupportSQLiteStatement.kt */
/* loaded from: classes.dex */
public interface g extends e {
    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    String simpleQueryForString();
}
