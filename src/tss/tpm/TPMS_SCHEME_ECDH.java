package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>
/**
* Underlying type comment: These are the ECC schemes that only need a hash algorithm as a controlling parameter.
*/
public class TPMS_SCHEME_ECDH extends TpmStructure implements TPMU_SCHEME_KEYEDHASH, TPMU_SIG_SCHEME, TPMU_KDF_SCHEME, TPMU_ASYM_SCHEME, TPMU_SIGNATURE 
{
    /**
    * Underlying type comment: These are the ECC schemes that only need a hash algorithm as a controlling parameter.
    * 
    * @param _hashAlg the hash algorithm used to digest the message
    */
    public TPMS_SCHEME_ECDH(TPM_ALG_ID _hashAlg)
    {
        hashAlg = _hashAlg;
    }
    /**
    * Underlying type comment: These are the ECC schemes that only need a hash algorithm as a controlling parameter.
    */
    public TPMS_SCHEME_ECDH() {};
    /**
    * the hash algorithm used to digest the message
    */
    public TPM_ALG_ID hashAlg;
    @Override
    public void toTpm(OutByteBuf buf) 
    {
        hashAlg.toTpm(buf);
        return;
    }
    @Override
    public void initFromTpm(InByteBuf buf)
    {
        hashAlg = TPM_ALG_ID.fromTpm(buf);
    }
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }
    public static TPMS_SCHEME_ECDH fromTpm (byte[] x) 
    {
        TPMS_SCHEME_ECDH ret = new TPMS_SCHEME_ECDH();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }
    public static TPMS_SCHEME_ECDH fromTpm (InByteBuf buf) 
    {
        TPMS_SCHEME_ECDH ret = new TPMS_SCHEME_ECDH();
        ret.initFromTpm(buf);
        return ret;
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_SCHEME_ECDH");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
        _p.add(d, "TPM_ALG_ID", "hashAlg", hashAlg);
    };
    
    
};

//<<<

