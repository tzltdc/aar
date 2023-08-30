package anycopy.io.sdk.demo;

import com.google.common.truth.Truth;
import org.junit.Test;

public class SdkLibAarUtilTest {

  @Test
  public void addition_isCorrect() {
    Truth.assertThat(SdkLibAarUtil.version()).isEqualTo("0.0.1");
  }
}