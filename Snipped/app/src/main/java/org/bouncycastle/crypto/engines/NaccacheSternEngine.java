package org.bouncycastle.crypto.engines;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class NaccacheSternEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NaccacheSternKeyParameters key;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);
    private Vector[] lookup = null;
    private boolean debug = false;

    private static BigInteger chineseRemainder(Vector vector, Vector vector2) {
        BigInteger bigInteger = ZERO;
        BigInteger bigInteger2 = ONE;
        for (int i = 0; i < vector2.size(); i++) {
            bigInteger2 = bigInteger2.multiply((BigInteger) vector2.elementAt(i));
        }
        for (int i9 = 0; i9 < vector2.size(); i9++) {
            BigInteger bigInteger3 = (BigInteger) vector2.elementAt(i9);
            BigInteger divide = bigInteger2.divide(bigInteger3);
            bigInteger = bigInteger.add(divide.multiply(divide.modInverse(bigInteger3)).multiply((BigInteger) vector.elementAt(i9)));
        }
        return bigInteger.mod(bigInteger2);
    }

    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) {
        if (this.forEncryption) {
            if (bArr.length > getOutputBlockSize() || bArr2.length > getOutputBlockSize()) {
                throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else if (bArr.length > getInputBlockSize() || bArr2.length > getInputBlockSize()) {
            throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        BigInteger mod = bigInteger.multiply(bigInteger2).mod(this.key.getModulus());
        if (this.debug) {
            PrintStream printStream = System.out;
            printStream.println("c(m1) as BigInteger:....... " + bigInteger);
            printStream.println("c(m2) as BigInteger:....... " + bigInteger2);
            printStream.println("c(m1)*c(m2)%n = c(m1+m2)%n: " + mod);
        }
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        System.arraycopy(mod.toByteArray(), 0, byteArray, byteArray.length - mod.toByteArray().length, mod.toByteArray().length);
        return byteArray;
    }

    public byte[] encrypt(BigInteger bigInteger) {
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        byte[] byteArray2 = this.key.getG().modPow(bigInteger, this.key.getModulus()).toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.debug) {
            System.out.println("Encrypted value is:  " + new BigInteger(byteArray));
        }
        return byteArray;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.forEncryption ? ((this.key.getLowerSigmaBound() + 7) / 8) - 1 : this.key.getModulus().toByteArray().length;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.forEncryption ? this.key.getModulus().toByteArray().length : ((this.key.getLowerSigmaBound() + 7) / 8) - 1;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.key = (NaccacheSternKeyParameters) cipherParameters;
        if (this.forEncryption) {
            return;
        }
        if (this.debug) {
            System.out.println("Constructing lookup Array");
        }
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        this.lookup = new Vector[smallPrimes.size()];
        for (int i = 0; i < smallPrimes.size(); i++) {
            BigInteger bigInteger = (BigInteger) smallPrimes.elementAt(i);
            int intValue = bigInteger.intValue();
            this.lookup[i] = new Vector();
            this.lookup[i].addElement(ONE);
            if (this.debug) {
                System.out.println("Constructing lookup ArrayList for " + intValue);
            }
            BigInteger bigInteger2 = ZERO;
            for (int i9 = 1; i9 < intValue; i9++) {
                bigInteger2 = bigInteger2.add(naccacheSternPrivateKeyParameters.getPhi_n());
                this.lookup[i].addElement(naccacheSternPrivateKeyParameters.getG().modPow(bigInteger2.divide(bigInteger), naccacheSternPrivateKeyParameters.getModulus()));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i9) {
        if (this.key == null) {
            throw new IllegalStateException("NaccacheStern engine not initialised");
        }
        if (i9 > getInputBlockSize() + 1) {
            throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
        }
        if (!this.forEncryption && i9 < getInputBlockSize()) {
            throw new InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
        }
        if (i != 0 || i9 != bArr.length) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i, bArr2, 0, i9);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (this.debug) {
            System.out.println("input as BigInteger: " + bigInteger);
        }
        if (this.forEncryption) {
            return encrypt(bigInteger);
        }
        Vector vector = new Vector();
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        for (int i10 = 0; i10 < smallPrimes.size(); i10++) {
            BigInteger modPow = bigInteger.modPow(naccacheSternPrivateKeyParameters.getPhi_n().divide((BigInteger) smallPrimes.elementAt(i10)), naccacheSternPrivateKeyParameters.getModulus());
            Vector vector2 = this.lookup[i10];
            if (vector2.size() != ((BigInteger) smallPrimes.elementAt(i10)).intValue()) {
                if (this.debug) {
                    System.out.println("Prime is " + smallPrimes.elementAt(i10) + ", lookup table has size " + vector2.size());
                }
                throw new InvalidCipherTextException("Error in lookup Array for " + ((BigInteger) smallPrimes.elementAt(i10)).intValue() + ": Size mismatch. Expected ArrayList with length " + ((BigInteger) smallPrimes.elementAt(i10)).intValue() + " but found ArrayList of length " + this.lookup[i10].size());
            }
            int indexOf = vector2.indexOf(modPow);
            if (indexOf == -1) {
                if (this.debug) {
                    PrintStream printStream = System.out;
                    printStream.println("Actual prime is " + smallPrimes.elementAt(i10));
                    printStream.println("Decrypted value is " + modPow);
                    printStream.println("LookupList for " + smallPrimes.elementAt(i10) + " with size " + this.lookup[i10].size() + " is: ");
                    for (int i11 = 0; i11 < this.lookup[i10].size(); i11++) {
                        System.out.println(this.lookup[i10].elementAt(i11));
                    }
                }
                throw new InvalidCipherTextException("Lookup failed");
            }
            vector.addElement(BigInteger.valueOf(indexOf));
        }
        return chineseRemainder(vector, smallPrimes).toByteArray();
    }

    public byte[] processData(byte[] bArr) {
        byte[] processBlock;
        if (this.debug) {
            System.out.println();
        }
        if (bArr.length <= getInputBlockSize()) {
            if (this.debug) {
                System.out.println("data size is less then input block size, processing directly");
            }
            return processBlock(bArr, 0, bArr.length);
        }
        int inputBlockSize = getInputBlockSize();
        int outputBlockSize = getOutputBlockSize();
        if (this.debug) {
            PrintStream printStream = System.out;
            printStream.println("Input blocksize is:  " + inputBlockSize + " bytes");
            printStream.println("Output blocksize is: " + outputBlockSize + " bytes");
            printStream.println("Data has length:.... " + bArr.length + " bytes");
        }
        byte[] bArr2 = new byte[((bArr.length / inputBlockSize) + 1) * outputBlockSize];
        int i = 0;
        int i9 = 0;
        while (i < bArr.length) {
            int i10 = i + inputBlockSize;
            if (i10 < bArr.length) {
                processBlock = processBlock(bArr, i, inputBlockSize);
                i = i10;
            } else {
                processBlock = processBlock(bArr, i, bArr.length - i);
                i = (bArr.length - i) + i;
            }
            if (this.debug) {
                System.out.println("new datapos is " + i);
            }
            if (processBlock == null) {
                if (this.debug) {
                    System.out.println("cipher returned null");
                }
                throw new InvalidCipherTextException("cipher returned null");
            }
            System.arraycopy(processBlock, 0, bArr2, i9, processBlock.length);
            i9 += processBlock.length;
        }
        byte[] bArr3 = new byte[i9];
        System.arraycopy(bArr2, 0, bArr3, 0, i9);
        if (this.debug) {
            System.out.println("returning " + i9 + " bytes");
        }
        return bArr3;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }
}
