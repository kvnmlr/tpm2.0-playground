package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>
/**
* This command allows the authorization secret for a hierarchy or lockout to be changed using the current authorization value as the command authorization.
*/
public class HierarchyChangeAuthResponse extends TpmStructure
{
    /**
    * This command allows the authorization secret for a hierarchy or lockout to be changed using the current authorization value as the command authorization.
    */
    public HierarchyChangeAuthResponse()
    {
    }
    @Override
    public void toTpm(OutByteBuf buf) 
    {
        return;
    }
    @Override
    public void initFromTpm(InByteBuf buf)
    {
    }
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }
    public static HierarchyChangeAuthResponse fromTpm (byte[] x) 
    {
        HierarchyChangeAuthResponse ret = new HierarchyChangeAuthResponse();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }
    public static HierarchyChangeAuthResponse fromTpm (InByteBuf buf) 
    {
        HierarchyChangeAuthResponse ret = new HierarchyChangeAuthResponse();
        ret.initFromTpm(buf);
        return ret;
    }
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPM2_HierarchyChangeAuth_RESPONSE");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
    
    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
    };
    
    
};

//<<<

