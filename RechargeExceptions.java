/*******Author Name: K Kavya Emp Id : 150778 Date: 5.7.2018 ******/

package com.dthoperator.exception;

public class RechargeExceptions extends Exception {

		
		private static final long serialVersionUID = 1L;
		public RechargeExceptions()
		{
			super();
		}
		public RechargeExceptions(String message, Throwable cause,
				boolean enableSuppression, boolean writableStackTrace) 
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}
		public RechargeExceptions(String message, Throwable cause) 
		{
			super(message, cause);
		}
		public RechargeExceptions(String message) 
		{
			super(message);			
		}
		public RechargeExceptions(Throwable cause) 
		{
			super(cause);			
		}
	}


