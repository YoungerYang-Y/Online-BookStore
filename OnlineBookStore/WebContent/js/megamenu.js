/******************************************
megamenu
******************************************/

window.Modernizr = function(a, b, c) {"use strict"
	function x(a) {}

	function y(a, b) {}

	function z(a, b) {}

	function A(a, b) {}

	function B(a, b, d) {}
	var d = "2.7.2",
		e = {},
		f = !0,
		g = b.documentElement,
		h = "modernizr",
		i = b.createElement(h),
		j = i.style,
		k, l = {}.toString,
		m = " -webkit- -moz- -o- -ms- ".split(" "),
		n = {},
		o = {},
		p = {},
		q = [],
		r = q.slice,
		s, t = function(a, c, d, e) {},
		u = function(b) {},
		v = {}.hasOwnProperty,
		w;
	!z(v, "undefined") && !z(v.call, "undefined") ? w = function(a, b) {} : w = function(a, b) {}, Function.prototype.bind || (Function.prototype.bind = function(b) {}), n.touch = function() {};
	for (var C in n) w(n, C) && (s = C.toLowerCase(), e[s] = n[C](), q.push((e[s] ? "" : "no-") + s));
	return e.addTest = function(a, b) {}, x(""), i = k = null,
		function(a, b) {}(this, b), e._version = d, e._prefixes = m, e.mq = u, e.testStyles = t, g.className = g.className.replace(/(^|\s)no-js(\s|jQuery)/, "jQuery1jQuery2") + (f ? " js " + q.join(" ") : ""), e
}(this, this.document), (function(jQuery) {
	var a = {},
		c = "doTimeout",
		d = Array.prototype.slice;
	jQuery[c] = function() {
		return b.apply(window, [0].concat(d.call(arguments)))
	};
	jQuery.fn[c] = function() {
		var f = d.call(arguments),
			e = b.apply(this, [c + f[0]].concat(f));
		return typeof f[0] === "number" || typeof f[1] === "number" ? this : e
	};

	function b(l) {
		var m = this,
			h, k = {},
			g = l ? jQuery.fn : jQuery,
			n = arguments,
			i = 4,
			f = n[1],
			j = n[2],
			p = n[3];

		function o() {
			k.id = setTimeout(function() {
				k.fn()
			}, j)
		}
		function e() {
			
		}
		if (p) {
			k.fn = function(q) {
				if (typeof p === "string") {
					p = g[p]
				}
				p.apply(m, d.call(n, i)) === true && !q ? o() : e()
			};
			o()
		} else {
			if (k.fn) {
				j === undefined ? e() : k.fn(j === false);
				return true
			} else {
				e()
			}
		}
	}
})(jQuery);
jQuery('document').ready(function() {
	unitActiveItem();
	if (Modernizr.touch) {
		var menuOpen = false;
		jQuery('.mtmegamenu .mt-root-item').on('touchstart', function(e) {
			var self = e.target;
			if (!menuOpen) {
				menuOpen = true;
				showMegamenuMenu(self);
			} else if (menuOpen && !jQuery(this).closest('.mt-root').children('.menu-items').hasClass('active')) {
				hideMegamenuMenu();
				showMegamenuMenu(self);
			} else {
				menuOpen = false;
				hideMegamenuMenu();
			}
		});
	} else {
		jQuery('.mtmegamenu .mt-root').hover(function(e) {
			if (mega_menu != 1) jQuery(this).doTimeout('fieldmenuhover', 150, showMegamenuMenu, e.target);
			else jQuery(this).doTimeout('fieldmenuhover', 150, showMegamenuMenu_rtl, e.target);
			jQuery(this).addClass('active');
		}, function() {
			jQuery(this).doTimeout('fieldmenuhover', 150, hideMegamenuMenu);
			jQuery(this).removeClass('active');
		});
	}
	
});

function showMegamenuMenu(el) {
	var mWidth = jQuery('.mtmegamenu').closest('.container').width();
	var pWidth = jQuery(el).closest('.mt-root').children('.menu-items').outerWidth();
	var _mpadding = (jQuery(window).width() - mWidth) / 2;
	var _menuHeight = jQuery('.mtmegamenu').height();
	var mTop = _menuHeight;
	var _containerOffset = jQuery('.mtmegamenu').closest('.container').offset();
	var _containerLeftPadding = parseInt(jQuery('.mtmegamenu').closest('.container').css('padding-left'));
	var _mainOffset = jQuery('.mtmegamenu').offset();
	var _menuPopupOffset = jQuery(el).closest('.mt-root').offset();
	var mLeft = _menuPopupOffset.left - _mpadding + (_containerOffset.left - _mainOffset.left) + _containerLeftPadding;
	if (mLeft + pWidth > mWidth) var xLeft = mWidth - pWidth + (_containerOffset.left - _mainOffset.left) + _containerLeftPadding;
	else var xLeft = _menuPopupOffset.left - _mpadding + (_containerOffset.left - _mainOffset.left) + _containerLeftPadding;
	jQuery(el).closest('.mt-root').children('.menu-items').css({
		'top': mTop,
		'left': xLeft
	}).addClass('active').slideDown('slow');
}

function hideMegamenuMenu() {
	jQuery('.mtmegamenu .menu-items.active').removeClass('active');
}

function unitActiveItem() {};;