package com.innowhere.relproxy.impl.jproxy.core;

import com.innowhere.relproxy.impl.GenericProxyImpl;
import com.innowhere.relproxy.impl.GenericProxyInvocationHandler;
import com.innowhere.relproxy.impl.jproxy.JProxyConfigImpl;
import com.innowhere.relproxy.impl.jproxy.core.clsmgr.ClassDescriptorSourceScript;
import com.innowhere.relproxy.impl.jproxy.core.clsmgr.JProxyEngine;
import com.innowhere.relproxy.impl.jproxy.core.clsmgr.SourceScript;
import com.innowhere.relproxy.jproxy.JProxyDiagnosticsListener;

/**
 *
 * @author jmarranz
 */
public abstract class JProxyImpl extends GenericProxyImpl
{
    public static JProxyImpl SINGLETON;      
    protected JProxyEngine engine;
    
    protected JProxyImpl()
    {
    }
    
    public static ClassLoader getDefaultClassLoader()
    {
        return Thread.currentThread().getContextClassLoader();
    }
    
    public ClassDescriptorSourceScript init(JProxyConfigImpl config,SourceScript scriptFile,ClassLoader classLoader)
    {
        super.init(config);
        
        String inputPath = config.getInputPath();
        String classFolder = config.getClassFolder();
        long scanPeriod = config.getScanPeriod();
        Iterable<String> compilationOptions = config.getCompilationOptions();
        JProxyDiagnosticsListener diagnosticsListener = config.getJProxyDiagnosticsListener();
        
        classLoader = classLoader != null ? classLoader : getDefaultClassLoader();      
        this.engine = new JProxyEngine(this,scriptFile,classLoader,inputPath,classFolder,scanPeriod,compilationOptions,diagnosticsListener);          
        return engine.init();
    }    
   
    
    public JProxyEngine getJProxyEngine()
    {
        return engine;
    }
    
    public boolean stop()
    {       
        return engine.stop();
    }                
    
    public boolean start()
    {       
        return engine.start();
    }     
    
    @Override
    public <T> GenericProxyInvocationHandler<T> createGenericProxyInvocationHandler(T obj)    
    {
        return new JProxyInvocationHandler<T>(obj,this);
    }
    
    public abstract Class getMainParamClass();
}
