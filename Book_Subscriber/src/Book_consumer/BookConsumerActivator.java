package Book_consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import Book_producer.Book_ProducerImplementation;
import Book_producer.Book_ProducerInterface;

public class BookConsumerActivator implements BundleActivator {

	ServiceReference serviceReferance;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		BookConsumerActivator.context = bundleContext;
		System.out.println("Book Consumer bundle started.");
		this.MainMethod();
		System.out.println("----  service started.");
	}
	
	private void MainMethod(){
		String user_option="no";
	
				ServiceReference serviceReference = context.getServiceReference(Book_ProducerImplementation.class.getName());
				Book_ProducerInterface Book_ProducerInterface =(Book_ProducerInterface)context.getService(serviceReference);
				submethodConsumer.Book_producer(Book_ProducerInterface);
				context.ungetService(serviceReference);
		
		while(user_option.equals("no"));	
		//submethodConsumer.PrintBill();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		BookConsumerActivator.context = null;
		System.out.println("Book Consumer service stopped.");
	}

}
