package div;

import java.util.*;

public class Main {
	private void method(String s) throws Exception {
	}
	public void generated_5008769909842074787(List<String> categories, List<String> selectedCategories) {
	}
	public Map<String, String> generated_9203691974776793760(String dialog) {
		return new HashMap<String,String>();
	}

	private void iHaveAnAnonymousClass() {
		TakingB anonymous = new TakingB() {
			// Must be the first anonymous class in Main for tests to pass
			@Override
			public void foo(B b) {
				TakingB2 anonymous = new TakingB2() {
					@Override
					public void bar(B b) {
						b.generated_3361901303989811535();
					}
				};
				anonymous.bar(b);
			}
		};
	}

	private void iHaveALocalClass() {
		class ALocalClass {
			public void foo(B b) {
				b.generated_6859332324963400619();
			}
		}
	}
	
	private void iHaveAnAnonymousClass2() {
		TakingB anonymous = new TakingB() {
			@Override
			public void foo(B b) {
				bar(b.c);
			}

			private void bar(C c) {
				c.generated_5592547944458024093(this);
			}
		};
	}
}