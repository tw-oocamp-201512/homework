package homework2;

import com.greghaskins.spectrum.Spectrum;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static homework2.Unit.cm;
import static homework2.Unit.m;
import static homework2.Unit.mm;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Spectrum.class)
public class ExampleSpec {

    {

        describe("各种单位的长度之间可以比较相等性", () -> {
            it("1m == 1m", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(1, m));
            });
            it("1m == 100cm", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(100, cm));
            });
            it("1m == 1000mm", () -> {
                assertThat(new Length(1, m)).isEqualTo(new Length(1000, mm));
            });
            it("1.1m == 1100mm", () -> {
                assertThat(new Length(1.1, m)).isEqualTo(new Length(1100, mm));
            });
            it("22cm == 220mm", () -> {
                assertThat(new Length(22, cm)).isEqualTo(new Length(220, mm));
            });
        });

    }
}
