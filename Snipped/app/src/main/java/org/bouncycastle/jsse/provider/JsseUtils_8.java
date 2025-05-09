package org.bouncycastle.jsse.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.provider.JsseUtils;

/* loaded from: classes.dex */
abstract class JsseUtils_8 extends JsseUtils_7 {

    public static class ExportSNIMatcher extends SNIMatcher {
        private final BCSNIMatcher matcher;

        public ExportSNIMatcher(BCSNIMatcher bCSNIMatcher) {
            super(bCSNIMatcher.getType());
            this.matcher = bCSNIMatcher;
        }

        @Override // javax.net.ssl.SNIMatcher
        public boolean matches(SNIServerName sNIServerName) {
            return this.matcher.matches(JsseUtils_8.importSNIServerName(sNIServerName));
        }

        public BCSNIMatcher unwrap() {
            return this.matcher;
        }
    }

    public static class ImportSNIMatcher extends BCSNIMatcher {
        private final SNIMatcher matcher;

        public ImportSNIMatcher(SNIMatcher sNIMatcher) {
            super(sNIMatcher.getType());
            this.matcher = sNIMatcher;
        }

        @Override // org.bouncycastle.jsse.BCSNIMatcher
        public boolean matches(BCSNIServerName bCSNIServerName) {
            return this.matcher.matches(JsseUtils_8.exportSNIServerName(bCSNIServerName));
        }

        public SNIMatcher unwrap() {
            return this.matcher;
        }
    }

    public static class UnknownServerName extends SNIServerName {
        public UnknownServerName(int i, byte[] bArr) {
            super(i, bArr);
        }
    }

    public static SNIMatcher exportSNIMatcher(BCSNIMatcher bCSNIMatcher) {
        if (bCSNIMatcher == null) {
            return null;
        }
        return bCSNIMatcher instanceof ImportSNIMatcher ? ((ImportSNIMatcher) bCSNIMatcher).unwrap() : new ExportSNIMatcher(bCSNIMatcher);
    }

    public static Object exportSNIMatchers(Collection<BCSNIMatcher> collection) {
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<BCSNIMatcher> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(exportSNIMatcher(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static SNIServerName exportSNIServerName(BCSNIServerName bCSNIServerName) {
        if (bCSNIServerName == null) {
            return null;
        }
        int type = bCSNIServerName.getType();
        byte[] encoded = bCSNIServerName.getEncoded();
        return type != 0 ? new UnknownServerName(type, encoded) : new SNIHostName(encoded);
    }

    public static Object exportSNIServerNames(Collection<BCSNIServerName> collection) {
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<BCSNIServerName> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(exportSNIServerName(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static BCSNIMatcher importSNIMatcher(SNIMatcher sNIMatcher) {
        if (sNIMatcher == null) {
            return null;
        }
        return sNIMatcher instanceof ExportSNIMatcher ? ((ExportSNIMatcher) sNIMatcher).unwrap() : new ImportSNIMatcher(sNIMatcher);
    }

    public static List<BCSNIMatcher> importSNIMatchers(Object obj) {
        Collection collection = (Collection) obj;
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(importSNIMatcher((SNIMatcher) it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static BCSNIServerName importSNIServerName(SNIServerName sNIServerName) {
        if (sNIServerName == null) {
            return null;
        }
        int type = sNIServerName.getType();
        byte[] encoded = sNIServerName.getEncoded();
        return type != 0 ? new JsseUtils.BCUnknownServerName(type, encoded) : new BCSNIHostName(encoded);
    }

    public static List<BCSNIServerName> importSNIServerNames(Object obj) {
        Collection collection = (Collection) obj;
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(importSNIServerName((SNIServerName) it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
