import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val purePotatoWeight = weight*(1-potatoWaterRatio)
    val totalPotatoWeight = purePotatoWeight/(1-crispsWaterRatio)
    totalPotatoWeight.setScale(5, HALF_UP)
}
