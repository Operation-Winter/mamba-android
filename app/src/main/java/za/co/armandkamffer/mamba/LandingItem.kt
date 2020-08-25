package za.co.armandkamffer.mamba

enum class LandingItem(val titleRes: Int, val imageRes: Int) {
    planningHost(R.string.landing_item_planning_host, R.drawable.planning_host),
    planningJoin(R.string.landing_item_planning_join, R.drawable.planning_join),
    retroHost(R.string.landing_item_retro_host, R.drawable.retro_host),
    retroJoin(R.string.landing_item_retro_join, R.drawable.retro_join)
}
