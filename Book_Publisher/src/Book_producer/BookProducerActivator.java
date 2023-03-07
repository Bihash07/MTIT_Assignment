package Book_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class BookProducerActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		BookProducerActivator.context = bundleContext;
		System.out.println("Book bundle started.");
		this.Book_producer();
		System.out.println("Book service started.");
	}
	
	private void Book_producer (){
		Book_ProducerInterface Book_producer = new Book_ProducerImplementation();
		context.registerService(Book_ProducerInterface.class, Book_producer,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		BookProducerActivator.context = null;
		System.out.println("Book service stopped.");
	}

}
