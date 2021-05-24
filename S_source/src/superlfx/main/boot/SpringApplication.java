package superlfx.main.boot;

import com.sun.xml.internal.ws.api.ResourceLoader;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: bull
 * @description:
 * @author:
 * @create: 2021-05-24
 */
public class SpringApplication {

    @Deprecated
    public static final String DEFAULT_CONTEXT_CLASS = "org.springframework.context.annotation.AnnotationConfigApplicationContext";
    @Deprecated
    public static final String DEFAULT_SERVLET_WEB_CONTEXT_CLASS = "org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext";
    @Deprecated
    public static final String DEFAULT_REACTIVE_WEB_CONTEXT_CLASS = "org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext";
    private Class<?> mainApplicationClass;


    public SpringApplication(Class<?>... primarySources) {
        this((ResourceLoader)null, primarySources);
    }

    public SpringApplication(ResourceLoader resourceLoader, Class<?>... primarySources) {
/*        // 1.资源初始化资源加载器为 null
        this.resourceLoader = resourceLoader;
        // 2.断言主要加载资源类不能为 null，否则报错
        Assert.notNull(primarySources, "PrimarySources must not be null");
        // 3.初始化主要加载资源类集合并去重
        this.primarySources = new LinkedHashSet<>(Arrays.asList(primarySources));
        // 4.推断当前web应用类型
        this.webApplicationType = WebApplicationType.deduceFromClasspath();
        this.bootstrapRegistryInitializers = getBootstrapRegistryInitializersFromSpringFactories();
        // 5.设置应用上下文初始化器
        setInitializers((Collection) getSpringFactoriesInstances(ApplicationContextInitializer.class));
        // 6.设置监听器
        setListeners((Collection) getSpringFactoriesInstances(ApplicationListener.class));
        // 7.推断主入口应用类
        this.mainApplicationClass = deduceMainApplicationClass();*/
    }


    //
    public ConfigurableApplicationContext run(String... args) {
/*        // 1.创建并启动时间监控
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        DefaultBootstrapContext bootstrapContext = this.createBootstrapContext();
        ConfigurableApplicationContext context = null;
        this.configureHeadlessProperty();
        SpringApplicationRunListeners listeners = this.getRunListeners(args);
        listeners.starting(bootstrapContext, this.mainApplicationClass);

        try {
            ApplicationArguments applicationArguments = new DefaultApplicationArguments(args);
            ConfigurableEnvironment environment = this.prepareEnvironment(listeners, bootstrapContext, applicationArguments);
            this.configureIgnoreBeanInfo(environment);
            Banner printedBanner = this.printBanner(environment);
            context = this.createApplicationContext();
            context.setApplicationStartup(this.applicationStartup);
            this.prepareContext(bootstrapContext, context, environment, listeners, applicationArguments, printedBanner);
            this.refreshContext(context);
            this.afterRefresh(context, applicationArguments);
            stopWatch.stop();
            if (this.logStartupInfo) {
                (new StartupInfoLogger(this.mainApplicationClass)).logStarted(this.getApplicationLog(), stopWatch);
            }

            listeners.started(context);
            this.callRunners(context, applicationArguments);
        } catch (Throwable var10) {
            this.handleRunFailure(context, var10, listeners);
            throw new IllegalStateException(var10);
        }

        try {
            listeners.running(context);
            return context;
        } catch (Throwable var9) {
            this.handleRunFailure(context, var9, (SpringApplicationRunListeners)null);
            throw new IllegalStateException(var9);
        }*/
        return null;
    }














}
