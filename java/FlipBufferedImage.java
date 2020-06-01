// Fast way to flip BufferedImage


	private void flip(BufferedImage image)
	{
    private int[] rgbArray = new int[image.getWidth()*image.getHeight()];
    
		image.getRaster().getSampleModel().getDataElements(0, 0, image.getWidth(), image.getHeight(), rgbArray, image.getRaster().getDataBuffer());
		
		int w = image.getWidth();
		int h = image.getHeight();
		for (int i=0; i < h/2; i++) {
	        for (int j=0; j < w; j++){
	            int tmp = rgbArray[i*w + j];
	            rgbArray[i*w + j] = rgbArray[(h-i-1)*w + j];
	            rgbArray[(h-i-1)*w + j] = tmp;
	        }
		}
		
		image.getRaster().getSampleModel().setDataElements(0, 0, image.getWidth(), image.getHeight(), rgbArray, image.getRaster().getDataBuffer());
	}
