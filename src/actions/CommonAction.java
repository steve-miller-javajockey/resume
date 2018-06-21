package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class CommonAction
	extends ActionSupport
	implements ServletRequestAware, ServletResponseAware
{	
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request = null;
	protected HttpServletResponse response = null;
	private String urlParams = "";
	
	
	public CommonAction()
	{
		super();
	}
	
	

    @Override
	public void setServletRequest(HttpServletRequest data)
	{
		request = data;
	}

	public HttpServletRequest getServletRequest()
	{
		return request;
	}
	  
	@Override
	public void setServletResponse(HttpServletResponse data)
	{
		response = data;
	}

	public HttpServletResponse getServletResponse()
	{
		return response;
	}

	public String getUrlParams() {
		return urlParams;
	}

	public void setUrlParams(String urlParams) {
		this.urlParams = urlParams;
	}

	
	
	public Object getRequest(String name)  
	{
	    Object obj = this.request.getParameter(name);
	    if(obj == null)
	      obj = this.request.getAttribute(name);
	    
	    return obj;
	}
	  
	public HttpServletRequest getRequest() 
	{
	    return this.request;
	}

	public void setRequest(String name, Object obj)  
	{
	   this.request.setAttribute(name, obj);
	}


}

